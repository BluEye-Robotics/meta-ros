DESCRIPTION = "cob_monitoring"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "diagnostic-updater roscpp topic-tools"

RDEPENDS_${PN} = "actionlib cob-light cob-msgs cob-script-server diagnostic-msgs ifstat ipmitool ntpdate paramiko python3-mechanize python3-psutil python3-requests rospy rostopic sensor-msgs std-msgs sysstat"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_monitoring/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "da7b5920a17c6565869429c3738e927c"
SRC_URI[sha256sum] = "0059021c89b85f78e24d90539097f1698f41127bb413e7eb503af53a7d85d489"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_monitoring-0.6.14-1"

inherit catkin
