DESCRIPTION = "Neato XV-11 Laser Driver. This driver works with the laser when it is removed from the XV-11 Robot as opposed to reading scans from the Neato's USB port."
AUTHOR = "Eric Perko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs roscpp boost"

RDEPENDS_${PN} = "boost"

SRC_URI = "https://github.com/rohbotics/xv_11_laser_driver-release/archive/release/melodic/xv_11_laser_driver/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7c8dc18e70ebaefaff703e7b850bfe06"
SRC_URI[sha256sum] = "7c6485e8b062b95fd61b2eceb47f042f5d069f1c6aad947f5c237f8968ec595c"

S = "${WORKDIR}/xv_11_laser_driver-release-release-melodic-xv_11_laser_driver-0.3.0-0"

inherit catkin
