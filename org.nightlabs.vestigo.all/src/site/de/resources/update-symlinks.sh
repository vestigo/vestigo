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


## DELETE first

DIR=${COPY_BASEDIR}
DIR_RELATIVE="."

ls -R | while read FILE; do 
	FILE_LAST_CHAR=${FILE:((${#FILE} - 1)):1}
#	echo "FILE_LAST_CHAR=${FILE_LAST_CHAR}"
	if [ "${FILE_LAST_CHAR}" = ":" ]; then
		FILE_CLEANED=${FILE%\:}
		FILE_CLEANED=${FILE_CLEANED#.}
		FILE_CLEANED=${FILE_CLEANED#/}
		echo "FILE_CLEANED=$FILE_CLEANED"
		DIR_RELATIVE=$FILE_CLEANED
		DIR="${COPY_BASEDIR}${FILE_CLEANED}"
	else
#		if [ "$DIR_RELATIVE" != "." -a "$FILE" != "" ]; then
		if [ "$FILE" != "" ]; then
			if [ -f "$DIR/$FILE" -a "$FILE" != "`basename $0`" ] ; then
				echo "Deleting file '$FILE' in directory '$DIR'."
#				createRelativeSymlink "$DIR" "$FILE"
				echo
			fi
		fi
	fi
done

exit

## Create symlinks (including parent directories)

DIR=${ORIG_BASEDIR}
DIR_RELATIVE="."

ls -R | while read FILE; do 
	FILE_LAST_CHAR=${FILE:((${#FILE} - 1)):1}
#	echo "FILE_LAST_CHAR=${FILE_LAST_CHAR}"
	if [ "${FILE_LAST_CHAR}" = ":" ]; then
		FILE_CLEANED=${FILE%\:}
		FILE_CLEANED=${FILE_CLEANED#.}
		FILE_CLEANED=${FILE_CLEANED#/}
		echo "FILE_CLEANED=$FILE_CLEANED"
		DIR_RELATIVE=$FILE_CLEANED
		DIR="${ORIG_BASEDIR}${FILE_CLEANED}"
	else
#		if [ "$DIR_RELATIVE" != "." -a "$FILE" != "" ]; then
		if [ "$FILE" != "" ]; then
			if [ -f "$DIR/$FILE" ] ; then
				echo "Processing file '$FILE' in directory '$DIR'."
				createRelativeSymlink "$DIR" "$FILE"
				echo
			fi
		fi
	fi
done