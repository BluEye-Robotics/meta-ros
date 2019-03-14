DESCRIPTION = "Mesh Conversion UtilityUsed to generate '. iv' files from '. stl' files. This package has notbeen changed since 2001 and appears to be very stable. We plan onkeeping this package in this revision for mesh conversions. Thispackage is only available as a single source file for download. Thereare no local modifications to this package."
AUTHOR = "John Burkardt"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ivcon-release/archive/release/melodic/ivcon/0.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b136c5b0548d6df802215048a00a8fc2"
SRC_URI[sha256sum] = "cbf6855c3a967f5e124a3ea7c6c954bbb57345030d77b22e2f76a77a17bcd3f3"

S = "${WORKDIR}/ivcon-release-release-melodic-ivcon-0.1.7-0"

inherit catkin
