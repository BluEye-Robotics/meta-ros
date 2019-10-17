DESCRIPTION = "rqt_py_trees provides a GUI plugin for visualizing py_trees behaviour trees based on rqt_tf_tree."
AUTHOR = "Thibault Kruse"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "py-trees py-trees-msgs rqt-bag geometry-msgs python3-rospkg python3-termcolor qt-dotgraph rospy rqt-graph rqt-gui rqt-gui-py py-trees py-trees-msgs rqt-bag unique-id python3-pygraphviz"

RDEPENDS_${PN} = "geometry-msgs python3-rospkg python3-termcolor qt-dotgraph rospy rqt-graph rqt-gui rqt-gui-py py-trees py-trees-msgs rqt-bag unique-id python3-pygraphviz"

SRC_URI = "https://github.com/stonier/rqt_py_trees-release/archive/release/melodic/rqt_py_trees/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7f4567b5b2576d08ebbed2098fe29fa"
SRC_URI[sha256sum] = "f01bb9ccb08d23b79f515c9fe65342463911d1af5c2cffec32c33845817b934f"

S = "${WORKDIR}/rqt_py_trees-release-release-melodic-rqt_py_trees-0.3.1-0"

inherit catkin
