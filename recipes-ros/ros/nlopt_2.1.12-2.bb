DESCRIPTION = "nlopt"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules mk rosbuild rospack libtool"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/nlopt/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9c72126aec925413aca17175b7ce87e7"
SRC_URI[sha256sum] = "2821b38b4d7a76dae02c1e40953ae5a1f68410f6f1c74014c5e1043966088489"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-nlopt-2.1.12-2"

inherit catkin
