DESCRIPTION = "Interface to IO board that manages emergency stop and battery voltage on rob@work 3"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-msgs cob-phidgets dynamic-reconfigure roscpp std-msgs"

RDEPENDS_${PN} = "python-tk rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_voltage_control/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b08463c08b0b0a6e4c12372e5ac6595c"
SRC_URI[sha256sum] = "7282f78802aa571e8ff6c0ca3b7b0baf8ac62709173adab5c9f5039a92882279"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_voltage_control-0.7.0-1"

inherit catkin
