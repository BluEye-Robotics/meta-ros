DESCRIPTION = "This app utilises pano_ros for taking snapshots and stitching them together to create panorama pictures."
AUTHOR = "Younghun Ju"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy std-msgs std-srvs sensor-msgs geometry-msgs nav-msgs turtlebot3-applications-msgs cv-bridge image-transport cmake-modules libeigen"

RDEPENDS_${PN} = "turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_panorama/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "65065f333dfe8698b24670bef2ee5d03"
SRC_URI[sha256sum] = "1ea012a9fb7e79c68cb54f5e608739f79f378ab6867bad8d1aeee3d7e5039c3e"

ROS_SPN = "turtlebot3_applications"
S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_panorama-1.1.0-0"

inherit catkin
