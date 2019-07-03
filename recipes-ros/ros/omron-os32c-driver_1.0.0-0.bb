DESCRIPTION = "Interface driver for Omron OS32C Lidar via Ethernet/IP (Industrial Protocol)"
AUTHOR = "Kareem Shehata"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost diagnostic-updater odva-ethernetip rosconsole-bridge roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/omron-release/archive/release/melodic/omron_os32c_driver/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca827d45b6a8fdb9c2bb3fcb45792c9d"
SRC_URI[sha256sum] = "680c4b43a5231555f0b1f42d5dcbe1a6345ce1ec19aa7a0e2a9024676070797e"

S = "${WORKDIR}/omron-release-release-melodic-omron_os32c_driver-1.0.0-0"

inherit catkin
