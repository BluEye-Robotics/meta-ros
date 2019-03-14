DESCRIPTION = "CAN bus tools using Dataspeed hardware"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dataspeed-can-msg-filters dataspeed-can-tools dataspeed-can-usb"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_can-release/archive/release/melodic/dataspeed_can/1.0.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5c0d150118308c59a0fa73079f9724d2"
SRC_URI[sha256sum] = "db45e27927b4142df69eb0748d76e39125e9c76bae491a84fc04f8aa9e7528aa"

S = "${WORKDIR}/dataspeed_can-release-release-melodic-dataspeed_can-1.0.12-0"

inherit catkin
