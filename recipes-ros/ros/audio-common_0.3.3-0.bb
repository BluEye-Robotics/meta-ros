DESCRIPTION = "Common code for working with audio in ROS"
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=e412bfc9312ba25bfbb7ea55d4c4409c"

DEPENDS = "audio-capture audio-common-msgs audio-play sound-play"

RDEPENDS_${PN} = "audio-capture audio-common-msgs audio-play sound-play"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_common/0.3.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "119eb4327115257d99b015d7b6395064"
SRC_URI[sha256sum] = "c30da5fa52747bb15685265588f9da95b14d15bb7f4cb569f954e9bba90cf8a7"

S = "${WORKDIR}/audio_common-release-release-melodic-audio_common-0.3.3-0"

inherit catkin
