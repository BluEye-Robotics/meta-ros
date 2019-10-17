DESCRIPTION = "3-D/6-DOF localization for mobile robots with 3-D LIDAR(s)"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs nav-msgs pcl-ros sensor-msgs std-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs mcl-3dl-msgs libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/mcl_3dl-release/archive/release/melodic/mcl_3dl/0.1.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "779ca586712ae3df54b1f83318469608"
SRC_URI[sha256sum] = "5afe0d0e3bdd0dcf60120a0dad7b22d4be95d4ff187936b69b18123b3d4fd075"

S = "${WORKDIR}/mcl_3dl-release-release-melodic-mcl_3dl-0.1.5-1"

inherit catkin
