DESCRIPTION = "cob_monitoring"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "diagnostic-updater roscpp topic-tools"

RDEPENDS_${PN} = "actionlib cob-light cob-msgs cob-script-server diagnostic-msgs ifstat ipmitool ntpdate paramiko python-mechanize python-psutil python-requests rospy rostopic sensor-msgs std-msgs sysstat"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_monitoring/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5d3f45f0a00b4d155f4f67f65425ba2"
SRC_URI[sha256sum] = "7f458dc0a7d3897c31208791af38a6d966233ca1bdabd2d6a4af229d09d03660"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_monitoring-0.6.15-1"

inherit catkin
