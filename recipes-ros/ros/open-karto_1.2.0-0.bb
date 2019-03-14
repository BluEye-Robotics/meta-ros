DESCRIPTION = "Catkinized ROS packaging of the OpenKarto library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost boost"

RDEPENDS_${PN} = "boost"

SRC_URI = "https://github.com/ros-gbp/open_karto-release/archive/release/melodic/open_karto/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c89854f906e9c4f40e28ee81c9a7cdc0"
SRC_URI[sha256sum] = "dd134fee71bd93a6e756305e084c1767c516f369c0afe70f921c87d040f84d1b"

S = "${WORKDIR}/open_karto-release-release-melodic-open_karto-1.2.0-0"

inherit catkin
