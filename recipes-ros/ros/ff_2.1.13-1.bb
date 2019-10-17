DESCRIPTION = "ff: pddl planner. see http://www. loria. fr/~hoffmanj/ff. html"
AUTHOR = "J.Hoffmann"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "mk flex bison unzip mk rosbuild rosbash rospack roslib ca-certificates openssl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/ff/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5bcf2ebc437b3e3a6beefe3cee030e71"
SRC_URI[sha256sum] = "7937f6b5795627983cffb79b3fd64d6e556db27246e2d48c5db3f8d788d267bb"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-ff-2.1.13-1"

inherit catkin
