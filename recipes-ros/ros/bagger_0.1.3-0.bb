DESCRIPTION = "An application used to systematically record rosbags"
AUTHOR = "Brenden Gibbons"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roslint roscpp std-msgs rostest"

RDEPENDS_${PN} = "rospy rosbag message-runtime"

SRC_URI = "https://github.com/squarerobot/bagger-release/archive/release/melodic/bagger/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b34beec44accf14d262a5d206e03891"
SRC_URI[sha256sum] = "e8275de0f4ad29f758472ae12d8ce534b53705ec57066e8611498b6077188226"

S = "${WORKDIR}/bagger-release-release-melodic-bagger-0.1.3-0"

inherit catkin
