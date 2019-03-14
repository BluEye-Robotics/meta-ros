DESCRIPTION = "ROS device driver for Velodyne 3D LIDARs."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-updater dynamic-reconfigure libpcap nodelet pluginlib roscpp tf velodyne-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/melodic/velodyne_driver/1.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "93868bc12198f4f013f5ba31995ec560"
SRC_URI[sha256sum] = "81b88ba93fe2af5da93cb4e2a8865912c11f35985cbb3636bf480c568b7a6fe4"

ROS_SPN = "velodyne"
S = "${WORKDIR}/velodyne-release-release-melodic-velodyne_driver-1.5.2-0"

inherit catkin
