DESCRIPTION = "jsk_network_tools"
AUTHOR = "Yusuke Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation sensor-msgs rostest diagnostic-msgs diagnostic-updater dynamic-reconfigure roscpp rospy std-msgs message-runtime sensor-msgs diagnostic-msgs diagnostic-updater dynamic-reconfigure roscpp rospy"

RDEPENDS_${PN} = "std-msgs message-runtime sensor-msgs diagnostic-msgs diagnostic-updater dynamic-reconfigure roscpp rospy"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_network_tools/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "713fbf132c8565bae3006657cf661b00"
SRC_URI[sha256sum] = "0b18287897e383f03659c05c224ed0ca710bdae634fc8633d1911f1fc6a2aa4f"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_network_tools-2.2.10-0"

inherit catkin
