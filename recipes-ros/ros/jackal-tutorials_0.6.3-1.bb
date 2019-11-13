DESCRIPTION = "Jackal's tutorials."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosdoc-lite"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_tutorials/0.6.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a700d0afaf59c8cae456bd1d3f83bf3"
SRC_URI[sha256sum] = "71daa344a4957b391be3d167abd58a32f345bdcb12f04e9205973730562cd862"

ROS_SPN = "jackal"
S = "${WORKDIR}/jackal-release-release-melodic-jackal_tutorials-0.6.3-1"

inherit catkin
