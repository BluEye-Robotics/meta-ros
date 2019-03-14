DESCRIPTION = "	 Package for turtlebot3 automatic_parking. You need a reflective tape and real robots. You can see parking spot using this pacakge on rviz."
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "rospy std-msgs sensor-msgs geometry-msgs nav-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_automatic_parking/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec658037806fbceae4462c6a44a5dffe"
SRC_URI[sha256sum] = "5ab127fe3a3ff9c1eb767058c423d2e7625925a482c808ddf35047daaa4852be"

ROS_SPN = "turtlebot3_applications"
S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_automatic_parking-1.1.0-0"

inherit catkin
