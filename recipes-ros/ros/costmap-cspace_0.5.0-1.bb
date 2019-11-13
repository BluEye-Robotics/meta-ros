DESCRIPTION = "3-dof configuration space costmap package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs laser-geometry nav-msgs sensor-msgs tf2-geometry-msgs tf2-ros tf2-sensor-msgs costmap-cspace-msgs neonavigation-common xmlrpcpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/costmap_cspace/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a1e8a014af50eda45c6cc64a3502156"
SRC_URI[sha256sum] = "c8a9d220abd9f4fdd5cd281ff4afc92c8aea6079c22949a27dc003e11b64cb02"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-costmap_cspace-0.5.0-1"

inherit catkin
