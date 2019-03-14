DESCRIPTION = "	 Utilities for flashing and enabling Kobuki's USB connection. 	 This package contains tools for flashing the Kobuki's FTDI chip (usually done at the factory). 	 The special firmware for the FTDI chip (USB to serial converter) enables it to appear as	 /dev/kobuki on the user's PC."
AUTHOR = "Younghun Ju"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-command-line libusb-dev libftdi-dev pkgconfig ftdi-eeprom ecl-command-line libusb-dev libftdi-dev ftdi-eeprom"

RDEPENDS_${PN} = "ecl-command-line libusb-dev libftdi-dev ftdi-eeprom"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_ftdi/0.7.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dd3b9bd83e1d0cc248eb5858baf3f2e3"
SRC_URI[sha256sum] = "e1c6ba8e7d1fbd11de09faca56c7dd845fb12aa44432909e2ae0df6867296828"

ROS_SPN = "kobuki_core"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_ftdi-0.7.8-0"

inherit catkin
