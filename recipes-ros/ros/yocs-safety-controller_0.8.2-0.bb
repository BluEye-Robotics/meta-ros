DESCRIPTION = "A controller ensuring the safe operation of your robot. The SafetyController listens to ranger readings in order to stop (and move back), if obstacles get to close. This controller can be enabled/disabled."
AUTHOR = "Marcus Liebhardt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs yocs-controllers ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs yocs-controllers"

RDEPENDS_${PN} = "ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs yocs-controllers"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_safety_controller/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b99a951a36b640c991ba4018535bff5d"
SRC_URI[sha256sum] = "83f0799143de08c0f6c8aa93c665fbac01d8a7dc3e8e04752bdc59e042244557"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_safety_controller-0.8.2-0"

inherit catkin
