DESCRIPTION = "The turtlebot3_slam package provides roslaunch scripts for starting the SLAM"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp sensor-msgs"

RDEPENDS_${PN} = "turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_slam/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b881da29c2cdf6b8c7625fa14c3aa199"
SRC_URI[sha256sum] = "76d43c239f22319a4f86404e9dc69e5bdee1a4dba98f2aaaefd01ec20fbd563c"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_slam-1.2.2-1"

inherit catkin
