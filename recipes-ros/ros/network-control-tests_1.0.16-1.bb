DESCRIPTION = "Test suite for the packages that are part of the "WiFi Test Setup" project: network_monitor_udp, network_traffic_control, hostapd_access_point, linksys_access_point, ddwrt_access_point."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "network-monitor-udp network-traffic-control hostapd-access-point linksys-access-point ddwrt-access-point access-point-control dynamic-reconfigure rostest network-monitor-udp network-traffic-control hostapd-access-point linksys-access-point ddwrt-access-point access-point-control dynamic-reconfigure rostest"

RDEPENDS_${PN} = "network-monitor-udp network-traffic-control hostapd-access-point linksys-access-point ddwrt-access-point access-point-control dynamic-reconfigure rostest"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_control_tests/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "731965f366fd94b1ea18bdef1cc64d34"
SRC_URI[sha256sum] = "dee0c19262fce70a1924a6ff71c1004ed3c44e9e03a010ccf7972a9222f90034"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_control_tests-1.0.16-1"

inherit catkin
