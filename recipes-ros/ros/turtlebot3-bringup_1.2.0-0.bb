DESCRIPTION = "roslaunch scripts for starting the TurtleBot3"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs diagnostic-msgs sensor-msgs turtlebot3-msgs"

RDEPENDS_${PN} = "turtlebot3-description turtlebot3-teleop joint-state-publisher robot-state-publisher rosserial-python hls-lfcd-lds-driver"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_bringup/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4417ab00eed23f44696311a1057993a5"
SRC_URI[sha256sum] = "afbf800cde94e405ffa9e691b9379042304dd8455e2c3e906cd7ba97ff636f70"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_bringup-1.2.0-0"

inherit catkin
