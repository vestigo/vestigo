#!/bin/bash

COPY_BASEDIR=`pwd`
ORIG_BASEDIR="${COPY_BASEDIR}/../../resources"
cd "${ORIG_BASEDIR}"
ORIG_BASEDIR=`pwd`

echo "COPY_BASEDIR=${COPY_BASEDIR}"
echo "ORIG_BASEDIR=${ORIG_BASEDIR}"

function process
{
	ORIG_PATH=$1
	SUFFIX=${ORIG_PATH#${ORIG_BASEDIR}}
	echo "SUFFIX=${SUFFIX}"
#	COPY_DIR=${}
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
			echo "Processing file '$PATH' in directory '$DIR'."
			process "$DIR/$PATH"
		fi
	fi
done
