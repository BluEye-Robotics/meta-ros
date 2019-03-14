DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using different plotting backends."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-matplotlib python-numpy python-rospkg python-pyqt5 qt-gui-py-common qwt-dependency rosgraph rostopic rqt-gui rqt-gui-py rqt-py-common std-msgs"

RDEPENDS_${PN} = "python-matplotlib python-numpy python-rospkg python-pyqt5 qt-gui-py-common qwt-dependency rosgraph rostopic rqt-gui rqt-gui-py rqt-py-common std-msgs"

SRC_URI = "https://github.com/ros-gbp/rqt_plot-release/archive/release/melodic/rqt_plot/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5a1651488cb4f2849e5197933a24cb7f"
SRC_URI[sha256sum] = "89cebc7715ea72f74783d846cb7149c5b7bbff21ab9bafe65e3d6f2509f75868"

S = "${WORKDIR}/rqt_plot-release-release-melodic-rqt_plot-0.4.8-0"

inherit catkin
