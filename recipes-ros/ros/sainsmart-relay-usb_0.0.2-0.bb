DESCRIPTION = "SainSmart USB relay driver controller"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib roscpp std-msgs libftdi-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/sainsmart_relay_usb-release/archive/release/melodic/sainsmart_relay_usb/0.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba389b068f0c56dbe3322f13d3155757"
SRC_URI[sha256sum] = "73e7449cf27e9caa518695cb6996d8909422ae70540708e07580a666560ddd66"

S = "${WORKDIR}/sainsmart_relay_usb-release-release-melodic-sainsmart_relay_usb-0.0.2-0"

inherit catkin
