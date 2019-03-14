DESCRIPTION = "Messages for vehicle automation"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = ""

RDEPENDS_${PN} = "automotive-navigation-msgs automotive-platform-msgs"

SRC_URI = "https://github.com/astuff/automotive_autonomy_msgs-release/archive/release/melodic/automotive_autonomy_msgs/2.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c0497df9e23788741d1ee1ea69d47650"
SRC_URI[sha256sum] = "95cd1339f688ca1420598f79fe87fd24a0e8e4907f07829867a9230880d642a2"

S = "${WORKDIR}/automotive_autonomy_msgs-release-release-melodic-automotive_autonomy_msgs-2.0.3-0"

inherit catkin
