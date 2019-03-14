DESCRIPTION = "sdsdddsdsds"
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy network-monitor-udp std-msgs diagnostic-msgs pr2-msgs asmach dynamic-reconfigure ieee80211-channels rospy network-monitor-udp std-msgs diagnostic-msgs pr2-msgs asmach dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy network-monitor-udp std-msgs diagnostic-msgs pr2-msgs asmach dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/multi_interface_roam/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f45307e0b501840068ff54dd7fcbe9ea"
SRC_URI[sha256sum] = "2cc32a6b9e3c72f150e3a780951283671bfcd9f2e51e8364f373b9af4f7cf9de"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-multi_interface_roam-1.0.13-2"

inherit catkin
