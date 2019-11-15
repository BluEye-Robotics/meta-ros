DESCRIPTION = "The package cob_generic_can provides an interface for nodes on a can-bus and examplary wrappers for two PeakSys-can-libs. When a can-bus-device is generated (for an example see base_dirve_chain) you can use generic_can to create as many itfs as there will be components communicating via this can-bus. Assign type of the can communication device (e. g. usb-to-can or can-card of a specific vendor) and can-address of the target device. This package comes with wrappers for PeakSys and PeakSysUSB adapters."
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-utilities libntcan libpcan socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_generic_can/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8323da864a90de63d862b20b982aea32"
SRC_URI[sha256sum] = "dafbd06ad919ad96e639e1861fe59ffc33ae31e8f57c69f88ad5a3c58729b59a"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_generic_can-0.7.1-1"

inherit catkin
