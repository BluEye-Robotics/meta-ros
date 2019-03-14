DESCRIPTION = "nlopt"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules mk rosbuild rospack libtool"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/nlopt/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ac02d14cdc9bfb986eb0a7d9151560dd"
SRC_URI[sha256sum] = "11db2eb2176747d51236c4504a61a75e51dec3f41d103c3768563b403d7e46ae"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-nlopt-2.1.11-0"

inherit catkin
