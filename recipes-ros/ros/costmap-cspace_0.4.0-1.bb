DESCRIPTION = "3-dof configuration space costmap package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs laser-geometry nav-msgs sensor-msgs tf2-geometry-msgs tf2-ros tf2-sensor-msgs costmap-cspace-msgs neonavigation-common xmlrpcpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/costmap_cspace/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4566608588d0d437d473371be594945a"
SRC_URI[sha256sum] = "f348d691d05d84eeac664cba12fbec411db59ab90a17c1d1a957f61037dcc72c"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-costmap_cspace-0.4.0-1"

inherit catkin
