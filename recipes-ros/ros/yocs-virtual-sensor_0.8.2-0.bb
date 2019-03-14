DESCRIPTION = "Virtual sensor that uses semantic map information to "see" obstacles undetectable by robot sensors. Current implementation cannot read obstacles from YAML files. Until this feature gets implemented, we use auxiliary scripts to read and publish files' content. Data directory contains some example files."
AUTHOR = "Jorge Santos"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tf roscpp sensor-msgs geometry-msgs yocs-msgs yocs-math-toolkit tf roscpp sensor-msgs geometry-msgs yocs-msgs yocs-math-toolkit rospy rospy-message-converter visualization-msgs"

RDEPENDS_${PN} = "tf roscpp sensor-msgs geometry-msgs yocs-msgs yocs-math-toolkit rospy rospy-message-converter visualization-msgs"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_virtual_sensor/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eceff2da688e2afa46a66dfc57b88b97"
SRC_URI[sha256sum] = "4505ba05080e444b2000591f1628a4e204e1efb9e9e45be6a8ccb19506193631"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_virtual_sensor-0.8.2-0"

inherit catkin
