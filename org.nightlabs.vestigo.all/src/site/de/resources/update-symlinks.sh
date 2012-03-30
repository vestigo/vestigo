#!/bin/bash

## This script DELETES ALL FILES in the current directory and all subdirectories and replaces
## them by symlinks.
## 2012-03-30. Marco :-)

## SUB_DIR references the original directory from which we symlink files into this directory.
SUB_DIR="../../resources"

COPY_BASEDIR=`dirname $0`
COPY_BASEDIR=`pwd`
COPY_BASEDIR="${COPY_BASEDIR}/"

ORIG_BASEDIR="${COPY_BASEDIR}${SUB_DIR}"
cd "${ORIG_BASEDIR}"
ORIG_BASEDIR=`pwd`
ORIG_BASEDIR="${ORIG_BASEDIR}/"

echo "COPY_BASEDIR=${COPY_BASEDIR}"
echo "ORIG_BASEDIR=${ORIG_BASEDIR}"

function createRelativeSymlink
{
	ORIG_DIR=$1
	ORIG_FILE=$2
	SUFFIX_DIR=${ORIG_DIR#${ORIG_BASEDIR}}
	if [ "${SUFFIX_DIR}" != "" ]; then
		SUFFIX_DIR="/$SUFFIX_DIR"
	fi
	echo "SUFFIX_DIR=${SUFFIX_DIR}"

	SUFFIX="${SUFFIX_DIR}/${ORIG_FILE}"
#	if [ "${SUFFIX:0:1}" != "/" ]; then
#		SUFFIX="/$SUFFIX"
#	fi
	echo "SUFFIX=${SUFFIX}"

	echo mkdir -p "${COPY_BASEDIR}${SUFFIX_DIR}"
	/bin/mkdir -p "${COPY_BASEDIR}${SUFFIX_DIR}"

	echo rm -v "${COPY_BASEDIR}${SUFFIX}"
	/bin/rm -v "${COPY_BASEDIR}${SUFFIX}"

	REPLACEMENT=""
	REST=${SUFFIX_DIR}
	echo "REST=$REST"
	while [ "$REST" != "" ]; do
		REST="${REST%\/*}"
		REPLACEMENT="${REPLACEMENT}../"
	done
	echo "REPLACEMENT=$REPLACEMENT"

	echo ln -s "${REPLACEMENT}${SUB_DIR}${SUFFIX}" "${COPY_BASEDIR}${SUFFIX}"
	/bin/ln -s "${REPLACEMENT}${SUB_DIR}${SUFFIX}" "${COPY_BASEDIR}${SUFFIX}"
}

DIR=${ORIG_BASEDIR}
DIR_RELATIVE="."

ls -R | while read PATH; do 
	PATH_LAST_CHAR=${PATH:((${#PATH} - 1)):1}
#	echo "PATH_LAST_CHAR=${PATH_LAST_CHAR}"
	if [ "${PATH_LAST_CHAR}" = ":" ]; then
		PATH_CLEANED=${PATH%\:}
		PATH_CLEANED=${PATH_CLEANED#.}
		PATH_CLEANED=${PATH_CLEANED#/}
		echo "PATH_CLEANED=$PATH_CLEANED"
		DIR_RELATIVE=$PATH_CLEANED
		DIR="${ORIG_BASEDIR}${PATH_CLEANED}"
	else
#		if [ "$DIR_RELATIVE" != "." -a "$PATH" != "" ]; then
		if [ "$PATH" != "" ]; then
			if [ -f "$DIR/$PATH" ] ; then
				echo "Processing file '$PATH' in directory '$DIR'."
				createRelativeSymlink "$DIR" "$PATH"
				echo
			fi
		fi
	fi
done
