DESCRIPTION = "3-dof configuration space costmap package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs laser-geometry nav-msgs sensor-msgs tf2-geometry-msgs tf2-ros tf2-sensor-msgs costmap-cspace-msgs neonavigation-common xmlrpcpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/costmap_cspace/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11361bc711a0c06df280f29b6886afc3"
SRC_URI[sha256sum] = "11ca5231f7ccf2ecf07b260bcab471f8b3fb0ebb45e91e70ec569912945b6fba"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-costmap_cspace-0.4.3-1"

inherit catkin
