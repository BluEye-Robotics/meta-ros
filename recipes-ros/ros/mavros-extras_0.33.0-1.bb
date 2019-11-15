DESCRIPTION = "Extra nodes and plugins for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "cmake-modules mavros roscpp geometry-msgs mavros-msgs sensor-msgs std-msgs visualization-msgs urdf tf tf2-eigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_extras/0.33.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "58be323242507c69cf2416e9a4570e48"
SRC_URI[sha256sum] = "700183bb6b1d1083fdaf0394de912251a60f3c3209a71ab4f412fe9b8760062e"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_extras-0.33.0-1"

inherit catkin
