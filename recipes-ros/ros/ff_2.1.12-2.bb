DESCRIPTION = "ff: pddl planner. see http://www. loria. fr/~hoffmanj/ff. html"
AUTHOR = "J.Hoffmann"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "mk flex bison unzip mk rosbuild rosbash rospack roslib ca-certificates openssl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/ff/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c15ae58ddd26915a070ce5900e8510f5"
SRC_URI[sha256sum] = "7129d14ffc1ec32e13a5e06dea0a4a761440e72d92a588012393659cc3d0f9f1"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-ff-2.1.12-2"

inherit catkin
