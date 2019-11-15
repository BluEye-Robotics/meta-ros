DESCRIPTION = "Driver package for interfacing the battery management system (BMS) on Care-O-bot."
AUTHOR = "mig-mc"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "diagnostic-msgs diagnostic-updater roscpp socketcan-interface std-msgs"

RDEPENDS_${PN} = "cob-msgs cob-srvs python3-numpy rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_bms_driver/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4a8cc3e9464620d4bd4252a48bcdd5d"
SRC_URI[sha256sum] = "bfd3f575618f8f3b37fa1afc8101c6d25903222a5c13568e0773be4583cc5357"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_bms_driver-0.7.1-1"

inherit catkin
