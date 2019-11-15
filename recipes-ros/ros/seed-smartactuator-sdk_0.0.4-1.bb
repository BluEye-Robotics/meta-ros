DESCRIPTION = "The seed_smartactuator_sdk package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/seed-solutions/seed_smartactuator_sdk-release/archive/release/melodic/seed_smartactuator_sdk/0.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bcd504e1537f492b18785b7c9d623693"
SRC_URI[sha256sum] = "7c51aaebd83b215d47b67e5e725536ead3e01e73415bf5be00347705a5305714"

S = "${WORKDIR}/seed_smartactuator_sdk-release-release-melodic-seed_smartactuator_sdk-0.0.4-1"

inherit catkin
