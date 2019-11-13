DESCRIPTION = "nlopt"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules mk rosbuild rospack libtool"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/nlopt/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "93b2e0d86a8dd86dcf1e8b97986dd823"
SRC_URI[sha256sum] = "4c86cbe9aa9eac2eacac2ec31f13d2b761156ee55744e46cdb44c86d246f876a"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-nlopt-2.1.13-1"

inherit catkin
