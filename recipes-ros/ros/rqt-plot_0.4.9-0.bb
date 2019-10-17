DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using different plotting backends."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-matplotlib python3-numpy python3-rospkg python3-pyqt5 qt-gui-py-common qwt-dependency rosgraph rostopic rqt-gui rqt-gui-py rqt-py-common std-msgs"

RDEPENDS_${PN} = "python3-matplotlib python3-numpy python3-rospkg python3-pyqt5 qt-gui-py-common qwt-dependency rosgraph rostopic rqt-gui rqt-gui-py rqt-py-common std-msgs"

SRC_URI = "https://github.com/ros-gbp/rqt_plot-release/archive/release/melodic/rqt_plot/0.4.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f362c7d5ba80024c0ffbe4d56476aabb"
SRC_URI[sha256sum] = "226ffb18dfbf7e879f20e2aecae2243582a4fae28e74a1f7d3b291e68f6a28fb"

S = "${WORKDIR}/rqt_plot-release-release-melodic-rqt_plot-0.4.9-0"

inherit catkin
