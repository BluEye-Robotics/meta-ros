DESCRIPTION = "sdsdddsdsds"
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy network-monitor-udp std-msgs diagnostic-msgs pr2-msgs asmach dynamic-reconfigure ieee80211-channels rospy network-monitor-udp std-msgs diagnostic-msgs pr2-msgs asmach dynamic-reconfigure ieee80211-channels python-twisted-core"

RDEPENDS_${PN} = "rospy network-monitor-udp std-msgs diagnostic-msgs pr2-msgs asmach dynamic-reconfigure ieee80211-channels python-twisted-core"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/multi_interface_roam/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "560dfd21368171d4d0a0d44bc5927026"
SRC_URI[sha256sum] = "63d583ac95a415fdd60c63c5056a5e1b11c9ec3f643028304d381bce18a3fb79"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-multi_interface_roam-1.0.16-1"

inherit catkin
