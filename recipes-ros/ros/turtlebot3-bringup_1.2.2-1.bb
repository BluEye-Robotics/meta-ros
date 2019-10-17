DESCRIPTION = "roslaunch scripts for starting the TurtleBot3"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs diagnostic-msgs sensor-msgs turtlebot3-msgs"

RDEPENDS_${PN} = "turtlebot3-description turtlebot3-teleop joint-state-publisher robot-state-publisher rosserial-python hls-lfcd-lds-driver"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_bringup/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21256d3e95ed8cf71e0538b3d7324fde"
SRC_URI[sha256sum] = "fd37a6185328f5fcf0bcc9be075363a81f04bd19df71eae40c10afad01517336"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_bringup-1.2.2-1"

inherit catkin
