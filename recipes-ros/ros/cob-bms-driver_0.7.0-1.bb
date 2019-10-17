DESCRIPTION = "Driver package for interfacing the battery management system (BMS) on Care-O-bot."
AUTHOR = "mig-mc"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "diagnostic-msgs diagnostic-updater roscpp socketcan-interface std-msgs"

RDEPENDS_${PN} = "cob-msgs cob-srvs python-numpy rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_bms_driver/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b49d4417f154b62850b9d36ec5d94c3c"
SRC_URI[sha256sum] = "3aaa4c0116867e6afa68ee7a4833ea7848c514ab96618902b48aa70e7848dda6"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_bms_driver-0.7.0-1"

inherit catkin
