DESCRIPTION = "ROS Driver for XSens MT/MTi/MTi-G devices."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy std-msgs tf sensor-msgs geometry-msgs diagnostic-msgs rospy std-msgs tf sensor-msgs geometry-msgs diagnostic-msgs python-pyserial"

RDEPENDS_${PN} = "rospy std-msgs tf sensor-msgs geometry-msgs diagnostic-msgs python-pyserial"

SRC_URI = "https://github.com/ethz-asl/ethzasl_xsens_driver-release/archive/release/melodic/xsens_driver/2.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9e6792bfb9c0034160574f0dc2b33dd"
SRC_URI[sha256sum] = "bf0a13bb4fd0e2891ca1f6b18c1d8bb071f8eb2446a07ee31abb850d821da693"

S = "${WORKDIR}/ethzasl_xsens_driver-release-release-melodic-xsens_driver-2.2.2-0"

inherit catkin
