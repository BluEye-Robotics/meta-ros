DESCRIPTION = "A ROS node that controls a hostapd-based access point. It is mainly intended for use with a wireless network adapter running in master mode. It implements the dynamic_reconfigure interface defined in the [[access_point_control]] package."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy access-point-control dynamic-reconfigure ieee80211-channels rospy access-point-control dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy access-point-control dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/hostapd_access_point/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ab425c8f46dc8b872d4ee3b8369ab8d"
SRC_URI[sha256sum] = "bea0177adb3f798682f1b3a981dbf8c76443c5b0588d067fef6ee2cd3adffb61"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-hostapd_access_point-1.0.13-2"

inherit catkin
