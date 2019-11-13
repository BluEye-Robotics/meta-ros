DESCRIPTION = ""
AUTHOR = "Ryohei Ueda"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "euslisp geneus roseus"

RDEPENDS_${PN} = "euslisp geneus roseus"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/jsk_roseus/1.7.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7b47e996f03998ec422ddf74439abe8"
SRC_URI[sha256sum] = "38497ef160c3e76b0602f2ddf41bb50ce54e8063de8a6ed3bce0984af02c1b09"

S = "${WORKDIR}/jsk_roseus-release-release-melodic-jsk_roseus-1.7.4-1"

inherit catkin
