DESCRIPTION = "ff: pddl planner. see http://www. loria. fr/~hoffmanj/ff. html"
AUTHOR = "J.Hoffmann"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "mk flex bison unzip mk rosbuild rosbash rospack roslib ca-certificates openssl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/ff/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ccb255c9386484651efde974b6bb751"
SRC_URI[sha256sum] = "659fc4d1dd3a388860d8daffe67a537beed9a9cb2cf1ec447546a2e90abd604c"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-ff-2.1.11-0"

inherit catkin
