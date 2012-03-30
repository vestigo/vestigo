#!/bin/bash

# This script DELETES ALL FILES in the current directory and all subdirectories and replaces
# them by symlinks.
# 2012-03-30. Marco :-)

SUB_DIR="resources"
COPY_BASEDIR=`pwd`
ORIG_BASEDIR="${COPY_BASEDIR}/../../${SUB_DIR}"
cd "${ORIG_BASEDIR}"
ORIG_BASEDIR=`pwd`

echo "COPY_BASEDIR=${COPY_BASEDIR}"
echo "ORIG_BASEDIR=${ORIG_BASEDIR}"

function process
{
	ORIG_PATH=$1
	SUFFIX=${ORIG_PATH#${ORIG_BASEDIR}}
	SUFFIX_DIR=${SUFFIX%/*}
#	echo "SUFFIX=${SUFFIX}"
	echo "SUFFIX_DIR=${SUFFIX_DIR}"

	echo mkdir -p "${COPY_BASEDIR}${SUFFIX_DIR}"
	/bin/mkdir -p "${COPY_BASEDIR}${SUFFIX_DIR}"

	echo rm -v "${COPY_BASEDIR}${SUFFIX}"
	/bin/rm -v "${COPY_BASEDIR}${SUFFIX}"

	REPLACEMENT=""
	REST=${SUFFIX_DIR}
	while [ "$REST" != "" ]; do
		REST="${REST%\/*}"
		REPLACEMENT="${REPLACEMENT}/.."
	done
	echo "REPLACEMENT=$REPLACEMENT"

	echo ln -s "../..${REPLACEMENT}/${SUB_DIR}${SUFFIX}" "${COPY_BASEDIR}${SUFFIX}"
	/bin/ln -s "../..${REPLACEMENT}/${SUB_DIR}${SUFFIX}" "${COPY_BASEDIR}${SUFFIX}"
}

DIR=${ORIG_BASEDIR}
DIR_RELATIVE="."

ls -R | while read PATH; do 
	PATH_LAST_CHAR=${PATH:((${#PATH} - 1)):1}
#	echo "PATH_LAST_CHAR=${PATH_LAST_CHAR}"
	if [ "${PATH_LAST_CHAR}" = ":" ]; then
		PATH_CLEANED=${PATH%\:}
		PATH_CLEANED=${PATH_CLEANED#\./}
#		echo "PATH_CLEANED=$PATH_CLEANED"
		DIR_RELATIVE=$PATH_CLEANED
		DIR="${ORIG_BASEDIR}/${PATH_CLEANED}"
	else
		if [ "$DIR_RELATIVE" != "." -a "$PATH" != "" ]; then
			ORIG_PATH="$DIR/$PATH"
			if [ -f "$ORIG_PATH" ] ; then
				echo "Processing file '$PATH' in directory '$DIR'."
				process "$ORIG_PATH"
				echo
			fi
		fi
	fi
done
