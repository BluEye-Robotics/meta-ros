DESCRIPTION = "Interface to IO board that manages emergency stop and battery voltage on rob@work 3"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-msgs cob-phidgets dynamic-reconfigure roscpp std-msgs"

RDEPENDS_${PN} = "python-tk rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_voltage_control/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e95544d969f04c3e7273cf621aeb9894"
SRC_URI[sha256sum] = "df3b7cc5459014b546c6a72fe6d974265f8561f86cb54cf2f68aed24b8f6196e"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_voltage_control-0.7.1-1"

inherit catkin
