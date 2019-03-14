DESCRIPTION = "Python and C++ interfaces for manipulating geodetic coordinates."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles geographic-msgs geometry-msgs sensor-msgs tf unique-id uuid-msgs python-catkin-pkg geographic-msgs geometry-msgs python-pyproj tf sensor-msgs unique-id uuid-msgs"

RDEPENDS_${PN} = "geographic-msgs geometry-msgs python-pyproj tf sensor-msgs unique-id uuid-msgs"

SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/melodic/geodesy/0.5.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b3dd5762ef543ad7b59fdb01cfe3ed22"
SRC_URI[sha256sum] = "58e20388e22a583385b39acf097e80a508617623d484f29a30f31ee96558f58b"

ROS_SPN = "geographic_info"
S = "${WORKDIR}/geographic_info-release-release-melodic-geodesy-0.5.3-0"

inherit catkin
