DESCRIPTION = "This package provides ros nodes for multi-sensor arrays from Terabee"
AUTHOR = "Pierre-Louis Kabaradjian"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation roscpp sensor-msgs geometry-msgs std-msgs dynamic-reconfigure rospy serial message-runtime roscpp sensor-msgs geometry-msgs std-msgs dynamic-reconfigure rospy serial"

RDEPENDS_${PN} = "message-runtime roscpp sensor-msgs geometry-msgs std-msgs dynamic-reconfigure rospy serial"

SRC_URI = "https://github.com/Terabee/teraranger_array-release/archive/release/melodic/teraranger_array/2.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc452576f764d51727df732ab378db47"
SRC_URI[sha256sum] = "7d5ebf525e7be16d78cbeb170579970889386e503e84f571b4187450e3784233"

S = "${WORKDIR}/teraranger_array-release-release-melodic-teraranger_array-2.0.0-1"

inherit catkin
