DESCRIPTION = "3-D/6-DOF localization for mobile robots with 3-D LIDAR(s)"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs nav-msgs pcl-ros sensor-msgs std-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs mcl-3dl-msgs libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/mcl_3dl-release/archive/release/melodic/mcl_3dl/0.1.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f10f058df13ec5d91b03fe4e3902d981"
SRC_URI[sha256sum] = "28b8194bd2312f9add9f1d4350364f6adcaab721056dbaa6924d99e727137371"

S = "${WORKDIR}/mcl_3dl-release-release-melodic-mcl_3dl-0.1.4-0"

inherit catkin
