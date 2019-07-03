DESCRIPTION = "The pythonwifi package is available through pypi, but not through a deb package. This is copy of the package suitable for use through the ROS ecosystem."
AUTHOR = "Róman Joost"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "python-catkin-pkg"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_python_wifi/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6fde25c930ad72d04a71be681ea4357b"
SRC_URI[sha256sum] = "a0fe115a173a08330e7680b085161aae0bde090b2749f58fbd5ee764fedc3765"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_python_wifi-0.3.2-0"

inherit catkin
